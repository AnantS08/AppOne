package com.org.proj.apponeapi.Repository;


import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AppOneRepository {

    @Query(nativeQuery = true)
    public List<String> findDataForFirstFilter(String search) {
        return null;
    }

    @Query(nativeQuery = true)
    public List<String> findDataForSecondFilter(String search) {
        return null;
    }

    @Query(nativeQuery = true)
    public List<String> findDataForThirdFilter(String search) {
        return null;
    }

    @Query(nativeQuery = true)
    public List<String> findDataForFourthFilter(String search) {
        return null;
    }

    @Query(nativeQuery = true)
    public List<String> findDataForFifthFilter(String search) {
        return null;
    }

    @Query(nativeQuery = true)
    public List<String> findDataForSixthFilter(String search) {
        return null;
    }

    @Query(nativeQuery = true)
    public List<String> findDataForSeventhFilter(String search) {
        return null;
    }

    @Query(nativeQuery = true)
    public List<String> findDataForEighthFilter(String search) {
        return null;
    }

    @Query(nativeQuery = true)
    public List<String> findDataForNinthFilter(String search) {
        return null;
    }

    @Query(nativeQuery = true)
    public List<String> findDataForTenthFilter(String search) {
        return null;
    }


}
