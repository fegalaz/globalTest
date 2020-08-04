package com.test.globallogic.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// TODO: Auto-generated Javadoc
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PhoneDTO {
	
	/** The number. */
	private String number;
	
	/** The city code. */
	private String cityCode;
	
	/** The country code. */
	private String countryCode;
}
