package com.gsuretech.gsuretechbank.controller;

import com.gsuretech.gsuretechbank.dto.*;
import com.gsuretech.gsuretechbank.entity.User;
import com.gsuretech.gsuretechbank.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
@Tag(name = "User Account Management APIs")
public class UserController {

    @Autowired
    UserService userService;

    @Operation(
            summary = "Create New User Account",
            description = "Creating a new user and assigning an account ID"
    )
    @ApiResponse(
            responseCode = "201",
            description = "HTTP Status 201 CREATED"
    )
    @PostMapping
    public BankResponse createAccount(@RequestBody UserRequest userRequest) {
        return userService.createAccount(userRequest);
    }

    @PostMapping("/login")
    public BankResponse login(@RequestBody LoginDto loginDto) {
        return userService.login(loginDto);

    }

    @Operation(
            summary = "Balance Enquiry",
            description = "Given an account number, check how much the user has"
    )
    @ApiResponse(
            responseCode = "200",
            description = "HTTP Status 200 SUCCESS"
    )
    @GetMapping("/balanceEnquiry")
    public BankResponse balanceEnquiry(@RequestBody EnquiryRequest enquiryRequest) {
        return userService.balanceEnquiry(enquiryRequest);
    }
    @GetMapping("/getUser/{id}")
    public UsersDto getUser(@PathVariable long id){
        return userService.getUser(id);
    }
    @GetMapping("/getUsers")
    public List<UsersDto> getUsers(){
        return userService.getUsers();
    }
    @Operation(
            summary = "Name Enquiry",
            description = "Given an account number, Get the username of the account"
    )
    @ApiResponse(
            responseCode = "200",
            description = "HTTP Status 200 SUCCESS"
    )
    @GetMapping("/nameEnquiry")
    public String nameEnquiry(@RequestBody EnquiryRequest enquiryRequest) {
        return userService.nameEnquiry(enquiryRequest);
    }

    @Operation(
            summary = "Credit an Account",
            description = "Given an account number, and amount, the account would be funded"
    )
    @ApiResponse(
            responseCode = "201",
            description = "HTTP Status 200 CREATED"
    )
    @PostMapping("/credit")
    public BankResponse creditAccount(@RequestBody CreditDebitRequest request) {
        return userService.creditAccount(request);
    }

    @Operation(
            summary = "Debit an Account",
            description = "Given an account number, and amount, the account would be debited"
    )
    @ApiResponse(
            responseCode = "201",
            description = "HTTP Status 200 CREATED"
    )
    @PostMapping("/debit")
    public BankResponse debitAccount(@RequestBody CreditDebitRequest request) {
        return userService.debitAccount(request);
    }

    @Operation(
            summary = "Transfer to an Account",
            description = "Given an account number, and amount, the account would be funded"
    )
    @ApiResponse(
            responseCode = "201",
            description = "HTTP Status 200 CREATED"
    )
    @PostMapping("/transfer")
    public BankResponse transer(@RequestBody TransferRequest request) {
        return userService.transfer(request);
    }
}
