package com.nizouba.service;

import com.nizouba.domain.dto.HouseDTO;
import com.nizouba.domain.dto.HouseSubscribeDTO;
import com.nizouba.domain.vo.request.DatatableSearch;
import com.nizouba.domain.vo.request.HouseForm;
import com.nizouba.domain.vo.request.MapSearch;
import com.nizouba.domain.vo.request.RentSearch;
import com.nizouba.enums.HouseSubscribeStatus;
import org.springframework.data.util.Pair;

import java.util.Date;

/**
 * 房屋管理服务接口
 * Created by 瓦力.
 */
public interface IHouseService {
    /**
     * 新增
     * @param houseForm
     * @return
     */
    ServiceResult<HouseDTO> save(HouseForm houseForm);

}
