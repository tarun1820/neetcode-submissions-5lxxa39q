class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map= new HashMap<String,List<String>>();
        for(String str : strs){
            int[] intArray = new int[26];
            for(char c : str.toCharArray()){
                intArray[c-'a']+=1;
            }
            String intArrayString = Arrays.toString(intArray);
            System.out.println(intArrayString);
            map.computeIfAbsent(intArrayString,p->new ArrayList<String>()).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
