
<https://leetcode-cn.com/problems/design-parking-system/>

```java
class ParkingSystem {

    private int big;
    private int medium;
    private int small;

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }
    
    public boolean addCar(int carType) {
        if (carType == 1) {
            if (big > 0) {
                big--;
                return true;
            }
            return false;
        }
        if (carType == 2) {
            if (medium > 0) {
                medium--;
                return true;
            }
            return false;
        }
        if (carType == 3) {
            if (small > 0){
                small--;
                return true;
            }
            return false;
        }
        return false;
    }
}
```

time: 16 beat:9

