import java.util.List;

public class Smartphone implements Radio,GPS{

    String model;
    String manufacturer;
    List <Contact> contactList;
    boolean radioStatus;
    String GPSPosition;

    public Smartphone() {
    }

    public Smartphone(String model, String manufacturer,String GPSPosition, List<Contact> contactList) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.GPSPosition= GPSPosition;
        this.contactList = contactList;
        this.radioStatus = false;

    }
    @Override
    public String getPosition() {
        return "Cologne";
    }
    @Override
    public boolean startRadio() {
        if (radioStatus == true){
            System.out.println("Radio is already on");
            return true;
        }
        System.out.println("Radio started");
        this.radioStatus = true;
        return true;
    }
    @Override
    public boolean stopRadio() {
        if (radioStatus == false){
            System.out.println("Radio is already off");
            return false;
        }
        System.out.println("Radio stopped");
        this.radioStatus = false;
        return false;
    }
    public boolean containsAtLeastOneContact (){
        return contactList.size() >= 1;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public List getContactList() {
        return contactList;
    }

    public void setContactList(List contactList) {
        this.contactList = contactList;
    }

    public String getGPSPosition() {
        return GPSPosition;
    }

    public void setGPSPosition(String GPSPosition) {
        this.GPSPosition = GPSPosition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Smartphone that)) return false;

        if (radioStatus != that.radioStatus) return false;
        if (getModel() != null ? !getModel().equals(that.getModel()) : that.getModel() != null) return false;
        if (getManufacturer() != null ? !getManufacturer().equals(that.getManufacturer()) : that.getManufacturer() != null)
            return false;
        if (getContactList() != null ? !getContactList().equals(that.getContactList()) : that.getContactList() != null)
            return false;
        return getGPSPosition() != null ? getGPSPosition().equals(that.getGPSPosition()) : that.getGPSPosition() == null;
    }

    @Override
    public int hashCode() {
        int result = getModel() != null ? getModel().hashCode() : 0;
        result = 31 * result + (getManufacturer() != null ? getManufacturer().hashCode() : 0);
        result = 31 * result + (getContactList() != null ? getContactList().hashCode() : 0);
        result = 31 * result + (radioStatus ? 1 : 0);
        result = 31 * result + (getGPSPosition() != null ? getGPSPosition().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", contactList=" + contactList +
                ", radioStatus=" + radioStatus +
                ", GPSPosition='" + GPSPosition + '\'' +
                '}';
    }
}
