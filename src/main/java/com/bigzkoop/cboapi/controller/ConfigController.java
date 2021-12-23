package com.bigzkoop.cboapi.controller;

import com.bigzkoop.cboapi.dto.*;
import com.bigzkoop.cboapi.service.*;
import com.bigzkoop.cboapi.utill.StandardResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/config")
public class ConfigController {

    private final StreetService streetService;
    private final PostOfficeService postOfficeService;
    private final VillageService villageService;
    private final AreaService areaService;
    private final ValveService valveService;
    private final GadivisionService gadivisionService;
    private final BillSectorService billSectorService;
    private final CategoryService categoryService;

    @GetMapping(path = "/street/get-by", params = {"id"}, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getAllStreets(@RequestParam Long id) {
        ArrayList<StreetDto> allStreets = streetService.getAllStreets(id);
        return new ResponseEntity(new StandardResponse("200", "Done", allStreets), HttpStatus.OK);
    }

    @GetMapping(path = "/post-office/get-by", params = {"id"}, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getAllPostOffices(@RequestParam Long id) {
        ArrayList<PostOfficeDto> allPostOffices = postOfficeService.getAllPostOffices(id);
        return new ResponseEntity(new StandardResponse("200", "Done", allPostOffices), HttpStatus.OK);
    }

    @GetMapping(path = "/village/get-by", params = {"id"}, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getAllVillages(@RequestParam Long id) {
        ArrayList<VillageDto> allVillages = villageService.getAllVillages(id);
        return new ResponseEntity(new StandardResponse("200", "Done", allVillages), HttpStatus.OK);
    }

    @GetMapping(path = "/area/get-by", params = {"id"}, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getAllAreas(@RequestParam Long id) {
        ArrayList<AreaDto> allAreas = areaService.getAllAreas(id);
        return new ResponseEntity(new StandardResponse("200", "Done", allAreas), HttpStatus.OK);
    }

    @GetMapping(path = "/valve/get-by", params = {"id"}, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getAllValves(@RequestParam Long id) {
        ArrayList<ValveDto> allValves = valveService.getAllValves(id);
        return new ResponseEntity(new StandardResponse("200", "Done", allValves), HttpStatus.OK);
    }

    @GetMapping(path = "/gadivisions/get-by", params = {"id"}, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getAllGadivisions(@RequestParam Long id) {
        ArrayList<GadivisionDto> allGadivisions = gadivisionService.getAllGadivisions(id);
        return new ResponseEntity(new StandardResponse("200", "Done", allGadivisions), HttpStatus.OK);
    }

    @GetMapping(path = "/bill-sector/get-by", params = {"id"}, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getAllBillSectors(@RequestParam Long id) {
        ArrayList<BillSectorsDto> allBillSectors = billSectorService.getAllBillSectors(id);
        return new ResponseEntity(new StandardResponse("200", "Done", allBillSectors), HttpStatus.OK);
    }

    @GetMapping(path = "/category/get-by", params = {"id"}, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getAllCategories(@RequestParam Long id) {
        ArrayList<CategoryDto> allCategories = categoryService.getAllCategories(id);
        return new ResponseEntity(new StandardResponse("200", "Done", allCategories), HttpStatus.OK);
    }
}
