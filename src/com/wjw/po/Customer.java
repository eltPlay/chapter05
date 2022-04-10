package com.wjw.po;

/**
 * The type Customer.
 */

/**
 * 客户类持久化
 */
public class Customer {
    private Integer id;// 主键id
    private String username;// 用户名
    private String jobs;// 工作
    private String phone;// 电话

    /**
     * Gets id.
     *
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Gets username.
     *
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets username.
     *
     * @param username the username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Gets jobs.
     *
     * @return the jobs
     */
    public String getJobs() {
        return jobs;
    }

    /**
     * Sets jobs.
     *
     * @param jobs the jobs
     */
    public void setJobs(String jobs) {
        this.jobs = jobs;
    }

    @Override
    public String toString() {
        return "Customer [id=" + id + ", username=" + username + ", jobs=" + jobs + ", phone=" + phone + "]";
    }

    /**
     * Gets phone.
     *
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets phone.
     *
     * @param phone the phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

}