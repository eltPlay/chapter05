package com.wjw.po;

/**
 * The type Customer.
 */

/**
 * �ͻ���־û�
 */
public class Customer {
    private Integer id;// ����id
    private String username;// �û���
    private String jobs;// ����
    private String phone;// �绰

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