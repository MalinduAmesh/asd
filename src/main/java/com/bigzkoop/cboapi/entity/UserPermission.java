package com.bigzkoop.cboapi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserPermission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roleId;
    private Long roleName;
    private boolean addNewProject;
    private boolean viewReport;
    private boolean reading;
    private boolean permissionToMainAccount;
    private boolean changeAccountBalance;
    private boolean transactionPasswordChange;
    private boolean passwordChangeOwn;
    private boolean setNewPanel;
    private boolean addNewConsumer;
    private boolean addCustomerBulk;
    private boolean addProductBulk;
    private boolean categoryAddDelete;
    private boolean adjustBillMargins;
    private boolean reverseTransaction;
    private boolean userCrud;
    private boolean addLedgerAccount;
    private boolean passwordChangeOthers;
    private boolean viewAssignerReports;
    private boolean editUser;
    private boolean createNewAccount;
    private boolean transactionsFromCategoryAccounts;

}
