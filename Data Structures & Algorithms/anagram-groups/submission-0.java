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
            List<String> AnagramList= map.getOrDefault(intArrayString,new ArrayList<String>());
            AnagramList.add(str);
            map.put(intArrayString,AnagramList);
        }
        return new ArrayList<>(map.values());
    }
}
