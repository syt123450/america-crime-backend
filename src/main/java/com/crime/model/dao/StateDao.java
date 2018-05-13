package com.crime.model.dao;

import com.crime.model.domain.Position;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by ss on 2018/5/13.
 */

@Repository
public interface StateDao {

    Position getStatePosition(@Param("name") String stateName);

}
