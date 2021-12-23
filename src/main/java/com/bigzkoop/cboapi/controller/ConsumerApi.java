package com.bigzkoop.cboapi.controller;

import com.bigzkoop.cboapi.dto.ConsumerDto;
import com.bigzkoop.cboapi.service.ConsumerService;
import com.bigzkoop.cboapi.utill.StandardResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
@RequestMapping("/api/v1/consumer/")
@RequiredArgsConstructor
@CrossOrigin
public class ConsumerApi {

    private static String path ="D:/BigZkoop/cbo-api/assets";

    private final ConsumerService consumerService;

    @PostMapping(value = "create")
    public ResponseEntity create(@RequestBody ConsumerDto consumerDto){
        consumerService.create(consumerDto);
        return new ResponseEntity(new StandardResponse("201","Done",consumerDto), HttpStatus.CREATED);
    }

    @PostMapping(path = "/consumerImages",consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity uploadPhotos(@RequestPart("image") MultipartFile multipartFile){

        try{
            String fileName = multipartFile.getOriginalFilename();
            System.out.println("fileName"+fileName);

            InputStream inputStream = multipartFile.getInputStream();

            Path path = Paths.get("D:/BigZkoop/cbo-api/assets");

            if (!Files.exists(path)){
                Files.createDirectories(path);
            }
            Files.copy(inputStream,path.resolve(fileName));
            return new ResponseEntity(new StandardResponse("200", "Image Uploaded", null), HttpStatus.CREATED);


        }catch (IOException e){
            e.printStackTrace();
            return new ResponseEntity(new StandardResponse("200", "Error", null), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
