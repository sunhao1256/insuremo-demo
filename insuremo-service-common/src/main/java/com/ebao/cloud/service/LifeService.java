package com.ebao.cloud.service;

import com.ebao.cloud.life.dto.quotation.QuotationRequest;
import com.ebao.cloud.life.dto.quotation.QuotationResponse;
import org.springframework.stereotype.Service;

@Service
public class LifeService {


  public QuotationResponse quotation(QuotationRequest request) {
    return new QuotationResponse();
  }
}
