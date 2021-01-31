# BabySearchSuggestionSystem

An exploratory-purpose CLI program that recreates the following idea:

A web browser has a search field where the user can enter a keyword, and clicking a confirmation button so it will redirect to another page with the results of search. When some string is entered in the search field, the program displays, below, some options to auto complete this string according to the searches already performed by the user.

For instance, if the words "algoritmos" and "algas" have just been looked, when typing the string "alg", the program ought to propose the words "algorithms" and "algas". Subsequently, for each string entered, the program ought to suggest recently looked words prefixed with this string. In the event that any word is exactly equivalent to the typed string, it ought to likewise be suggested.

Our BabySearchSuggestionSystem is inspired by the portrayed idea above, thus, It is concerned about the amount of words that will be suggested, and the maximum size (length) they can reach. So the program is proposed to be given a couple of words previously searched, and a series of inquiries (are being searched) made out of strings, at that point utilizing these, it shows the number of words the program ought to suggest, and the length of the biggest of these words.

# Sample Case:

**Exact form of how inputs are entered in the program:**

    5
    maratonaicpc
    marathon
    programacao
    progress inputs
    inputs
    3
    marat
    programacao
    outputs



**Exact form of its output:**

    2 12
    1 11
    -1 
