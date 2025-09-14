package com.corexfin.service;

import com.corexfin.dto.request.BankRequest;
import com.corexfin.dto.response.BankResponse;
import com.corexfin.exception.BankNotFoundException;
import com.corexfin.model.Bank;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.WebRequest;

import java.util.List;

@Service
public interface BankService {

        public BankResponse addAdminBankInCorexfin(BankRequest bankRequest, WebRequest webRequest);
        public Bank  getBankFromCorexfinById(String bankId) throws BankNotFoundException;
        public Bank  getBankFromCorexfinByName(String bankName) throws BankNotFoundException;
        public List<Bank> getAllBankFromCorexfin();
        public BankResponse updateBankTOCorexfinById(String bankId,BankRequest bankRequest, WebRequest webRequest);
        public BankResponse updateBankTOCorexfinByEmail(String email,BankRequest bankRequest, WebRequest webRequest);
        public BankResponse deleteBankFromCorexfinById(String bankId);

}
