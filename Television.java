public class Television {
// The purpose of this class is to model a television
// Cornelius Toole 02/11/16

private final String MANUFACTURER;
private final int SCREEN_SIZE;

private boolean powerOn;
private int channel;
private int volume;

// This constructors allows the client to provide a maufacturer
// and screen size for the Television instance being created.
public Television(String brand, int size)
{
  MANUFACTURER = brand;
  SCREEN_SIZE = size;
  powerOn = false;
  volume = 20;
  channel = 2;
}

}
