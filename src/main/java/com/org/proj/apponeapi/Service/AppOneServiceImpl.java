package com.org.proj.apponeapi.Service;

import com.org.proj.apponeapi.Repository.AppOneRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class AppOneServiceImpl implements AppOneService{

    @Autowired
    AppOneRepository appOneRepository;

    @Override
    public List<String> getFirstFilter(String search)
    {
        List<String> dataList= appOneRepository.findFirstFilterDataWithSearch(search);
        if(dataList.isEmpty()) {
            log.info("Data Not Found For First Filter");
            return null;
        }
        return dataList;
    }

    @Override
    public List<String> getSecondFilter(String search) {
        List<String> dataList= appOneRepository.findSecondFilterDataWithSearch(search);
        if(dataList.isEmpty()) {
            log.info("Data Not Found For Second Filter");
            return null;
        }
        return dataList;
    }

    @Override
    public List<String> getThirdFilter(String search) {
        List<String> dataList= appOneRepository.findThirdFilterDataWithSearch(search);
        if(dataList.isEmpty()) {
            log.info("Data Not Found For Third Filter");
            return null;
        }
        return dataList;
    }

    @Override
    public List<String> getFourthFilter(String search) {
        List<String> dataList= appOneRepository.findFourthFilterDataWithSearch(search);
        if(dataList.isEmpty()) {
            log.info("Data Not Found For Fourth Filter");
            return null;
        }
        return dataList;
    }

    @Override
    public List<String> getFifthFilter(String search) {
        List<String> dataList= appOneRepository.findFifthFilterDataWithSearch(search);
        if(dataList.isEmpty()) {
            log.info("Data Not Found Fifth Filter");
            return null;
        }
        return dataList;
    }

    @Override
    public List<String> getSixthFilter(String search) {
        List<String> dataList= appOneRepository.findSixthFilterDataWithSearch(search);
        if(dataList.isEmpty()) {
            log.info("Data Not Found For Sixth Filter");
            return null;
        }
        return dataList;
    }

    @Override
    public List<String> getSeventhFilter(String search) {
        List<String> dataList= appOneRepository.findSeventhFilterDataWithSearch(search);
        if(dataList.isEmpty()) {
            log.info("Data Not Found For Seventh Filter");
            return null;
        }
        return dataList;
    }

    @Override
    public List<String> getEighthFilter(String search) {
        List<String> dataList= appOneRepository.findEighthFilterDataWithSearch(search);
        if(dataList.isEmpty()) {
            log.info("Data Not Found For Eighth Filter");
            return null;
        }
        return dataList;
    }

    @Override
    public List<String> getNinthFilter(String search) {
        List<String> dataList= appOneRepository.findNinthFilterDataWithSearch(search);
        if(dataList.isEmpty()) {
            log.info("Data Not Found For Ninth Filter");
            return null;
        }
        return dataList;
    }

    @Override
    public List<String> getTenthFilter(String search) {
        List<String> dataList= appOneRepository.findTenthFilterDataWithSearch(search);
        if(dataList.isEmpty()) {
            log.info("Data Not Found For Tenth Filter");
            return null;
        }
        return dataList;
    }
}
