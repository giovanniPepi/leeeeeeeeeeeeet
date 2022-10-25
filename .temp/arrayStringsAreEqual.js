var arrayStringsAreEqual = function (word1, word2) {
    var word1Str = word1.join('');
    var word2Str = word1.join('');
    for (var _i = 0, word1Str_1 = word1Str; _i < word1Str_1.length; _i++) {
        var ch = word1Str_1[_i];
        if (word2Str.includes(ch))
            continue;
        else
            return false;
    }
    return true;
};
console.log(arrayStringsAreEqual(["a", "cb"], ["ab", "c"]));
