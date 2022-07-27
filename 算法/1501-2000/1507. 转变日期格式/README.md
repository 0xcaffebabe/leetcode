
<https://leetcode-cn.com/problems/reformat-date/>

```java
class Solution {
    public String reformatDate(String date) {
        String[] arr = date.split(" ");
        String year = arr[2];
        String month = "";
        String day = arr[0].replaceAll("st", "")
                            .replaceAll("nd", "")
                            .replaceAll("rd", "")
                            .replaceAll("th", "");
        if (day.length() == 1) day = "0" + day;
        String[] map = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        for(int i = 0;i<map.length;i++) {
            if (map[i].equals(arr[1])) {
                if (i < 9) {
                    month = "0" + (i+1);
                }else {
                    month = (i+1) + "";
                }
            }
        }
        return year+"-"+month+"-"+day;
    }
}
```

time:12 beat:8

