/**
 * @param {string} pattern
 * @param {string} s
 * @return {boolean}
 */

// LeetCode 290. Word Pattern in JavaScript

var wordPattern = function (pattern, s) {
  // We split letters and words into string arrays
  const letters = pattern.split("");
  const words = s.split(" ");

  // Then, we create a HashMap to store what we iterate
  const letterToWordMap = new Map();
  const wordToLetterMap = new Map();

  // If the length is different, we already know the pattern
  // is a mismatch and return false
  if (letters.length != words.length) return false;

  // iterate through the letter array
  for (let i = 0; i < letters.length; i++) {
    let currentLetter = letters[i];
    let currentWord = words[i];

    // check if we can find the current letter/word it in the hashmap
    const isMappedLetter = wordToLetterMap.get(currentWord);
    const isMappedWord = letterToWordMap.get(currentLetter);

    // check if the letter/word are mapped
    // if the letter/word is not mapped, it should be the same as the current word/letter, otherwise return false
    if (
      (isMappedLetter && isMappedLetter !== currentLetter) ||
      (isMappedWord && isMappedWord !== currentWord)
    )
      return false;

    // else, we add it to our hashmap
    wordToLetterMap.set(words[i], letters[i]);
    letterToWordMap.set(letters[i], words[i]);
  }
  return true;
};
