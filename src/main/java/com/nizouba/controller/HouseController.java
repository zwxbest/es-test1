package com.nizouba.controller;

import com.nizouba.domain.vo.response.ApiResponse;
import com.nizouba.domain.vo.response.SubwayDTO;
import com.nizouba.domain.vo.response.SubwayStationDTO;
import com.nizouba.domain.vo.response.SupportAddressDTO;
import com.nizouba.service.IUserService;
import com.nizouba.service.IAddressService;

import com.nizouba.service.ServiceMultiResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by 瓦力.
 */
@Controller
public class HouseController {

    @Autowired
    private IAddressService addressService;

    @Autowired
    private IUserService userService;

    /**
     * 获取支持城市列表
     * @return
     */
    @GetMapping("address/support/cities")
    @ResponseBody
    public ApiResponse getSupportCities() {
        ServiceMultiResult<SupportAddressDTO> result = addressService.findAllCities();
        if (result.getResultSize() == 0) {
            return ApiResponse.ofStatus(ApiResponse.Status.NOT_FOUND);
        }
        return ApiResponse.ofSuccess(result.getResult());
    }
    /**
     * 获取对应城市支持区域列表
     * @param cityEnName
     * @return
     */
    @GetMapping("address/support/regions")
    @ResponseBody
    public ApiResponse getSupportRegions(@RequestParam(name = "city_name") String cityEnName) {
        ServiceMultiResult<SupportAddressDTO> addressResult = addressService.findAllRegionsByCityName(cityEnName);
        if (addressResult.getResult() == null || addressResult.getTotal() < 1) {
            return ApiResponse.ofStatus(ApiResponse.Status.NOT_FOUND);
        }
        return ApiResponse.ofSuccess(addressResult.getResult());
    }

    /**
     * 获取具体城市所支持的地铁线路
     * @param cityEnName
     * @return
     */
    @GetMapping("address/support/subway/line")
    @ResponseBody
    public ApiResponse getSupportSubwayLine(@RequestParam(name = "city_name") String cityEnName) {
        List<SubwayDTO> subways = addressService.findAllSubwayByCity(cityEnName);
        if (subways.isEmpty()) {
            return ApiResponse.ofStatus(ApiResponse.Status.NOT_FOUND);
        }

        return ApiResponse.ofSuccess(subways);
    }

    /**
     * 获取对应地铁线路所支持的地铁站点
     * @param subwayId
     * @return
     */
    @GetMapping("address/support/subway/station")
    @ResponseBody
    public ApiResponse getSupportSubwayStation(@RequestParam(name = "subway_id") Long subwayId) {
        List<SubwayStationDTO> stationDTOS = addressService.findAllStationBySubway(subwayId);
        if (stationDTOS.isEmpty()) {
            return ApiResponse.ofStatus(ApiResponse.Status.NOT_FOUND);
        }

        return ApiResponse.ofSuccess(stationDTOS);
    }

}
