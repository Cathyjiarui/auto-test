package com.puhui.Service.impl;

import com.puhui.Service.RepayCaseManageService;
import com.puhui.bean.repay.RepayCaseManage;
import com.puhui.mapper.repay.RepayCaseManageMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName RepayCaseManageServiceImpl
 * @Description TODO
 * @Author JiaZhang
 * @Date 2018/12/26 5:48 PM
 * @Version 1.0
 **/
@Service
public class RepayCaseManageServiceImpl implements RepayCaseManageService {

    @Resource
    private RepayCaseManageMapper repayCaseManageMapper;

    @Override
    public RepayCaseManage getCase(String id){
        return repayCaseManageMapper.getCase(id);
    }

    @Override
    public boolean UpdateStatus(String core_request_id){
        boolean reltus = false;
        try{
            repayCaseManageMapper.UpdateStatus(core_request_id);
            reltus = true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return reltus;
    }
}
