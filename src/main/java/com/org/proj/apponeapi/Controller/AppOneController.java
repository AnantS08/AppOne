package com.org.proj.apponeapi.Controller;

import com.org.proj.apponeapi.Service.AppOneService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class AppOneController implements AppOneControllerApi {

    @Autowired
    AppOneService appOneService;

    //Start of Filters
    @Override
    public ResponseEntity<List<String>> getFirstFilter(String search) {
        log.info("Calling First filter Service Method from Controller");
        return ResponseEntity.ok(appOneService.getFirstFilter(search));
    }

    @Override
    public ResponseEntity<List<String>> getSecondFilter(String search) {
        log.info("Calling Second filter Service Method from Controller");
        return ResponseEntity.ok(appOneService.getSecondFilter(search));
    }

    @Override
    public ResponseEntity<List<String>> getThirdFilter(String search) {
        log.info("Calling Third service Service Method from Controller");
        return ResponseEntity.ok(appOneService.getThirdFilter(search));
    }

    @Override
    public ResponseEntity<List<String>> getFourthFilter(String search) {
        log.info("Calling Fourth filter Service Method from Controller");
        return ResponseEntity.ok(appOneService.getFourthFilter(search));
    }

    @Override
    public ResponseEntity<List<String>> getFifthFilter(String search) {
        log.info("Calling Fifth filter Service Method from Controller");
        return ResponseEntity.ok(appOneService.getFifthFilter(search));
    }

    @Override
    public ResponseEntity<List<String>> getSixthFilter(String search) {
        log.info("Calling Sixth filter Service Method from Controller");
        return ResponseEntity.ok(appOneService.getSixthFilter(search));
    }

    @Override
    public ResponseEntity<List<String>> getSeventhFilter(String search) {
        log.info("Calling Seventh filter Service Method from Controller");
        return ResponseEntity.ok(appOneService.getSeventhFilter(search));
    }

    @Override
    public ResponseEntity<List<String>> getEighthFilter(String search) {
        log.info("Calling Eighth filter Service Method from Controller");
        return ResponseEntity.ok(appOneService.getEighthFilter(search));
    }

    @Override
    public ResponseEntity<List<String>> getNinthFilter(String search) {
        log.info("Calling Ninth filter Service Method from Controller");
        return ResponseEntity.ok(appOneService.getNinthFilter(search));
    }

    @Override
    public ResponseEntity<List<String>> getTenthFilter(String search) {
        log.info("Calling Tenth filter Service Method from Controller");
        return ResponseEntity.ok(appOneService.getTenthFilter(search));
    }

    //End of Filters

}