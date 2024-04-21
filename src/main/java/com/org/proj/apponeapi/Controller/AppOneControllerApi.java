package com.org.proj.apponeapi.Controller;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequestMapping(value = "/api/v1")
@ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "OK"),
//        @ApiResponse(responseCode = "201", description = "OK"),
        @ApiResponse(responseCode = "400", description = "Bad Request"),
        @ApiResponse(responseCode = "401", description = "Unauthorized"),
        @ApiResponse(responseCode = "403", description = "Forbidden"),
        @ApiResponse(responseCode = "500", description = "Internal Server Error")})
public interface  AppOneControllerApi {

    @Operation(tags = {"filters"}, operationId = "First Filter", summary = "This is the first filter")
    @ApiResponses(value = {@ApiResponse()})
    @GetMapping(value = "/first-filter", produces = {"application/json", "Application/problem+json"})
    ResponseEntity<List<String>> getFirstFilter(@RequestParam("search") String search);

    @Operation(tags = {"filters"}, operationId = "Second Filter", summary = "This is the second filter")
    @ApiResponses(value = {@ApiResponse()})
    @GetMapping(value = "/second-filter", produces = {"application/json", "Application/problem+json"})
    ResponseEntity<List<String>> getSecondFilter(@RequestParam("search") String search);

    @Operation(tags = {"filters"}, operationId = "Third Filter", summary = "This is the third filter")
    @ApiResponses(value = {@ApiResponse()})
    @GetMapping(value = "/third-filter", produces = {"application/json", "Application/problem+json"})
    ResponseEntity<List<String>> getThirdFilter(@RequestParam("search") String search);

    @Operation(tags = {"filters"}, operationId = "Fourth Filter", summary = "This is the fourth filter")
    @ApiResponses(value = {@ApiResponse()})
    @GetMapping(value = "/fourth-filter", produces = {"application/json", "Application/problem+json"})
    ResponseEntity<List<String>> getFourthFilter(@RequestParam("search") String search);

    @Operation(tags = {"filters"}, operationId = "Fifth Filter", summary = "This is the fifth filter")
    @ApiResponses(value = {@ApiResponse()})
    @GetMapping(value = "/fifth-filter", produces = {"application/json", "Application/problem+json"})
    ResponseEntity<List<String>> getFifthFilter(@RequestParam("search") String search);

    @Operation(tags = {"filters"}, operationId = "Sixth Filter", summary = "This is the sixth filter")
    @ApiResponses(value = {@ApiResponse()})
    @GetMapping(value = "/sixth-filter", produces = {"application/json", "Application/problem+json"})
    ResponseEntity<List<String>> getSixthFilter(@RequestParam("search") String search);

    @Operation(tags = {"filters"}, operationId = "Seventh Filter", summary = "This is the seventh filter")
    @ApiResponses(value = {@ApiResponse()})
    @GetMapping(value = "/seventh-filter", produces = {"application/json", "Application/problem+json"})
    ResponseEntity<List<String>> getSeventhFilter(@RequestParam("search") String search);

    @Operation(tags = {"filters"}, operationId = "Eighth Filter", summary = "This is the eighth filter")
    @ApiResponses(value = {@ApiResponse()})
    @GetMapping(value = "/eighth-filter", produces = {"application/json", "Application/problem+json"})
    ResponseEntity<List<String>> getEighthFilter(@RequestParam("search") String search);

    @Operation(tags = {"filters"}, operationId = "Ninth Filter", summary = "This is the ninth filter")
    @ApiResponses(value = {@ApiResponse()})
    @GetMapping(value = "/ninth-filter", produces = {"application/json", "Application/problem+json"})
    ResponseEntity<List<String>> getNinthFilter(@RequestParam("search") String search);

    @Operation(tags = {"filters"}, operationId = "Tenth Filter", summary = "This is the tenth filter")
    @ApiResponses(value = {@ApiResponse()})
    @GetMapping(value = "/tenth-filter", produces = {"application/json", "Application/problem+json"})
    ResponseEntity<List<String>> getTenthFilter(@RequestParam("search") String search);
}
