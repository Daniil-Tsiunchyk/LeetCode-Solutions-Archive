package Task_2125;

class Solution {
    public static int numberOfBeams(String[] bank) {
        int[] deviceCountPerRow = new int[bank.length];
        for (int i = 0; i < bank.length; i++) {
            String row = bank[i];
            for (int j = 0; j < row.length(); j++) {
                if (row.charAt(j) == '1') {
                    deviceCountPerRow[i]++;
                }
            }
        }

        int totalBeams = 0;
        int previousRowDeviceCount = 0;
        for (int deviceCount : deviceCountPerRow) {
            if (deviceCount > 0) {
                totalBeams += previousRowDeviceCount * deviceCount;
                previousRowDeviceCount = deviceCount;
            }
        }

        return totalBeams;
    }
}
