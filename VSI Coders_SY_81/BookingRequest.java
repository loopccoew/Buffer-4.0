package Buffer;
import java.util.*;
public class BookingRequest {
	private String tenantName;
	private String tenantContact;
	private int propertyId;
	private PropertyNode property;
	private String status;

	public BookingRequest(String tenantName, String tenantContact, int propertyId) {
		this.tenantName = tenantName;
		this.tenantContact = tenantContact;
		this.propertyId = propertyId;
		this.status=null;
	}

	public String getTenantName() {
		return tenantName;
	}

	public void setTenantName(String tenantName) {
		this.tenantName = tenantName;
	}

	public String getTenantContact() {
		return tenantContact;
	}

	public void setTenantContact(String tenantContact) {
		this.tenantContact = tenantContact;
	}

	public int getPropertyId() {
		return propertyId;
	}

	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
	}

	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status=status;
	}
	public PropertyNode getProperty() {
		return property;
	}
	public void setProperty(PropertyNode property) {
		this.property = property;
	}

	public void getProperty(ArrayList<PropertyNode> properties) {
		for (PropertyNode property : properties) {
			if (property.getId()==this.propertyId) {
				this.setProperty(property);
				break;
			}
		}
	}

	public String getpropertyAddress() {
		return null;
	}

	public int getpropertyPrice() {
		return 0;
	}
}

