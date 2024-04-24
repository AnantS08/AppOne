package com.org.proj.apponeapi.Repository;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AppOneRepository {

    @Query(nativeQuery = true)
    public List<String> findFirstFilterDataWithSearch(@Param("search") String search) {
        return null;
    }

    @Query(nativeQuery = true)
    public List<String> findSecondFilterDataWithSearch(@Param("search")String search) {
        return null;
    }

    @Query(nativeQuery = true)
    public List<String> findThirdFilterDataWithSearch(@Param("search")String search) {
        return null;
    }

    @Query(nativeQuery = true)
    public List<String> findFourthFilterDataWithSearch(@Param("search")String search) {
        return null;
    }

    @Query(nativeQuery = true)
    public List<String> findFifthFilterDataWithSearch(@Param("search")String search) {
        return null;
    }

    @Query(nativeQuery = true)
    public List<String> findSixthFilterDataWithSearch(@Param("search")String search) {
        return null;
    }

    @Query(nativeQuery = true)
    public List<String> findSeventhFilterDataWithSearch(@Param("search")String search) {
        return null;
    }

    @Query(nativeQuery = true)
    public List<String> findEighthFilterDataWithSearch(@Param("search")String search) {
        return null;
    }

    @Query(nativeQuery = true)
    public List<String> findNinthFilterDataWithSearch(@Param("search")String search) {
        return null;
    }

    @Query(nativeQuery = true)
    public List<String> findTenthFilterDataWithSearch(@Param("search")String search) {
        return null;
    }


}
