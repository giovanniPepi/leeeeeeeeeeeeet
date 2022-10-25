// https://leetcode.com/problems/ransom-note/discuss/2136886/Javascript-Readable

const canConstruct = (ransomNote: string, magazine: string ) => {
  for (let ch of ransomNote) {
    if (magazine.includes(ch)) {
      magazine = magazine.replace(ch, '');
    } else return false;
  }
  return true;
}