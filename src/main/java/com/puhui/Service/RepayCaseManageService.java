package com.puhui.Service;

import com.puhui.bean.repay.RepayCaseManage;

public interface RepayCaseManageService {

    RepayCaseManage getCase(String id);

    boolean UpdateStatus(String core_request_id);
}
