const arrayStringsAreEqual = (word1, word2) => {
    const word1Str = word1.join('');
    const word2Str = word1.join('');
    for (let ch of word1Str) {
        if (word2Str.includes(ch))
            continue;
        else
            return false;
    }
    return true;
};
console.log(arrayStringsAreEqual(["a", "cb"], ["ab", "c"]));
