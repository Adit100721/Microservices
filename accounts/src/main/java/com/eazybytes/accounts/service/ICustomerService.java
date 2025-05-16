package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDetailsDto;

public interface ICustomerService {
    /**
     *
     * @param mobileNumber
     * @return  customer Details
     */

    CustomerDetailsDto fetchCustomerDetails(String mobileNumber,String correlationId);
}
