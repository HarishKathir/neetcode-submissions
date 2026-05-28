class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String s = reArrange(strs[i]);
            List<String> list = map.getOrDefault(s,new ArrayList<>());
            list.add(strs[i]);
            map.put(s,list);
        }
        return new ArrayList<>(map.values());
    }
    private String reArrange(String s){
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return String.valueOf(arr);
    }
}
