package com.org.proj.apponeapi.Service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class AppOneServiceImpl implements AppOneService{



    @Override
    public List<String> getFirstFilter(String search)
    {
        return Arrays.asList("Value 1", "Value 2", search);
    }

    @Override
    public List<String> getSecondFilter(String search) {
        return Arrays.asList("Value 3", "Value 4", search);
    }

    @Override
    public List<String> getThirdFilter(String search) {
        return Arrays.asList("Value 5", "Value 6", search);
    }

    @Override
    public List<String> getFourthFilter(String search) {
        return Arrays.asList("Value 7", "Value 8", search);
    }

    @Override
    public List<String> getFifthFilter(String search) {
        return Arrays.asList("Value 9", "Value 10", search);
    }

    @Override
    public List<String> getSixthFilter(String search) {
        return Arrays.asList("Value 11", "Value 12", search);
    }

    @Override
    public List<String> getSeventhFilter(String search) {
        return Arrays.asList("Value 13", "Value 14", search);
    }

    @Override
    public List<String> getEighthFilter(String search) {
        return Arrays.asList("Value 15", "Value 16", search);
    }

    @Override
    public List<String> getNinthFilter(String search) {
        return Arrays.asList("Value 17", "Value 18", search);
    }

    @Override
    public List<String> getTenthFilter(String search) {
        return Arrays.asList("Value 19", "Value 20", search);
    }
}
