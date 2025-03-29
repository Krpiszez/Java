package CompetetiveCoding;

public class SearchInsert {

    public int searchInsert(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) return i;
        }

        return nums.length;

    }

    public int search(int[] nums) {
        int min = nums[0];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                min = Math.min(min, Math.min(nums[i], nums[j]));
            }
        }

        return min;
    }

    public static void main(String[] args) {
        SearchInsert si = new SearchInsert();
        si.searchInsert(new int[]{1, 3, 5, 6}, 5);
        System.out.println(si.search(new int[]{8,3,5,2,1243,1223,124,31239,32,12312,412312,521321456,5324324,123124,321421,21321125,536435,436346,345345234,4332432,532423432,5324234,235236234,3243283,4234234,23523423,4324,235234,23423523,23423,4235234,324236,23324,1523,1213,132,12,-2535,6,-5,32,12,421,321,532,213124,213124,32141,52423,123123,421125,536123,123124,4215123,1234}));
    }
}
