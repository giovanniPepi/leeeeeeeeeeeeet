class Solution {

  // LeetCode 290. Word Pattern in Java

  public boolean wordPattern(String pattern, String s) {

    // Split words into an string array;
    var words = s.split(" ");

    // if the length of the pattern array and the length of words are diff, return false
    if(pattern.length() != words.length) {return false;};

    // create a single hashMap that stores Character:String
    var wordMap = new HashMap<Character, String>();

    // Loop through each letter from the string array
    for (int i=0; i < words.length; i++) {
      // if the word map doesn't have the current value, we add it:
      if(!wordMap.containsValue(words[i])) {
        // putIfAbsent is used to map the specified key with the specified value,
        // only if no such key exists (or is mapped to null)  in this HashMap instance
        wordMap.putIfAbsent(pattern.charAt(i), words[i]);
      }

      //Else, if the word map doesn't have the same value for the key(pattern word),
      // or it has the value, but not to the same key, we know the pattern is broken and return false
      if(!wordMap.containsKey(pattern.charAt(i)) || !wordMap.get(pattern.charAt(i)).equals(words[i])) {
        return false;
      }
    }
    return true;
  }

}