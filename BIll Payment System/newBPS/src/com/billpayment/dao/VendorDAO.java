package com.billpayment.dao;

import com.billpayment.model.VendorPojo;

public interface VendorDAO {
	public int saveVendor(VendorPojo ven);
	public int updateVendor(VendorPojo ven);
}
