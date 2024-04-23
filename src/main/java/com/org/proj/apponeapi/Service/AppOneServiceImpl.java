package com.org.proj.apponeapi.Service;

import com.org.proj.apponeapi.Repository.AppOneRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Slf4j
@Service
public class AppOneServiceImpl implements AppOneService{

    @Autowired
    AppOneRepository appOneRepository;

    @Override
    public List<String> getFirstFilter(String search)
    {
        List<String> dataList= appOneRepository.findDataForFirstFilter(search);
        if(dataList.isEmpty()) {
            log.info("Data Not Found");
            return null;
        }
        return dataList;
    }

    @Override
    public List<String> getSecondFilter(String search) {
        List<String> dataList= appOneRepository.findDataForSecondFilter(search);
        if(dataList.isEmpty()) {
            log.info("Data Not Found");
            return null;
        }
        return dataList;
    }

    @Override
    public List<String> getThirdFilter(String search) {
        List<String> dataList= appOneRepository.findDataForThirdFilter(search);
        if(dataList.isEmpty()) {
            log.info("Data Not Found");
            return null;
        }
        return dataList;
    }

    @Override
    public List<String> getFourthFilter(String search) {
        List<String> dataList= appOneRepository.findDataForFourthFilter(search);
        if(dataList.isEmpty()) {
            log.info("Data Not Found");
            return null;
        }
        return dataList;
    }

    @Override
    public List<String> getFifthFilter(String search) {
        List<String> dataList= appOneRepository.findDataForFifthFilter(search);
        if(dataList.isEmpty()) {
            log.info("Data Not Found");
            return null;
        }
        return dataList;
    }

    @Override
    public List<String> getSixthFilter(String search) {
        List<String> dataList= appOneRepository.findDataForSixthFilter(search);
        if(dataList.isEmpty()) {
            log.info("Data Not Found");
            return null;
        }
        return dataList;
    }

    @Override
    public List<String> getSeventhFilter(String search) {
        List<String> dataList= appOneRepository.findDataForSeventhFilter(search);
        if(dataList.isEmpty()) {
            log.info("Data Not Found");
            return null;
        }
        return dataList;
    }

    @Override
    public List<String> getEighthFilter(String search) {
        List<String> dataList= appOneRepository.findDataForEighthFilter(search);
        if(dataList.isEmpty()) {
            log.info("Data Not Found");
            return null;
        }
        return dataList;
    }

    @Override
    public List<String> getNinthFilter(String search) {
        List<String> dataList= appOneRepository.findDataForNinthFilter(search);
        if(dataList.isEmpty()) {
            log.info("Data Not Found");
            return null;
        }
        return dataList;
    }

    @Override
    public List<String> getTenthFilter(String search) {
        List<String> dataList= appOneRepository.findDataForTenthFilter(search);
        if(dataList.isEmpty()) {
            log.info("Data Not Found");
            return null;
        }
        return dataList;
    }
}
