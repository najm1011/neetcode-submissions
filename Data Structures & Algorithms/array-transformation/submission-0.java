

class Solution {
    public List<Integer> transformArray(int[] arr) {

        boolean changed = true; 
        while(changed){
            changed = false;

            int[] copy = Arrays.copyOf(arr, arr.length);

        for (int i = 1; i < arr.length-1; i++){

        int left = arr[i-1]; int right = arr[i+1];

            if (arr[i] > left && arr[i] > right){
            copy[i] = arr[i] - 1;
            changed =  true; 
        }
        else if(arr[i] < left && arr[i] <right){
            copy[i] = arr[i] + 1;
            changed = true; 
        }
        else;

        }
        arr = copy;
        

        }
        return Arrays.stream(arr).boxed().collect(Collectors.toList());

        

    }

}
