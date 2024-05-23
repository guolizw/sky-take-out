package com.sky.service;

import com.sky.dto.EmployeeDTO;
import com.sky.dto.EmployeeLoginDTO;
import com.sky.dto.EmployeePageQueryDTO;
import com.sky.entity.Employee;
import com.sky.result.PageResult;

/**
 * @author guolizw
 * @date 2024/05/22
 */
public interface EmployeeService {

    /**
     * 员工登录
     *
     * @param employeeLoginDTO
     * @return
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);

    /**
     * 新增员工
     */
    void addEmployee(EmployeeDTO employeeDTO);

    /**
     * 分页查询员工
     *
     * @param employeePageQueryDTO
     * @return
     */
    PageResult pageQuery(EmployeePageQueryDTO employeePageQueryDTO);

    /**
     * 启用禁用员工账号
     *
     * @param status
     * @param id
     */
    void userManage(Integer status, Long id);

    /**
     * 根据id查询员工接口
     *
     * @param id
     * @return
     */
    Employee getEmployeeById(Long id);

    /**
     * 修改员工信息
     *
     * @param employeeDTO
     */
    void updateEmployee(EmployeeDTO employeeDTO);
}
