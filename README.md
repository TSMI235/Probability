# Probability

### Discrete Random Variables
Abstract class for all of the following random vaiables
Shares fullpmf() method that prints the full probability mass function in the case
that the distribution has a range.

# Binomial Random Variable
Accessable with the class Binomial
Constructor takes two parameters, n (The number of trials ran), p (The probability a trial is successful)
pmf(k) returns the probability of k success in n trials.
pmf() takes values from {0,1,2,...,n}

# Geometric Random Variable
Accessable with the class Geometric
Constructor takes one parameter, p (The probability a trial is successful)
pmf(k) returns the probability of of the first success happening on the kth trial.
pmf() takes values from {1,2,...,∞}

# Negative Binomial Variable
Accessable with the class NegativeBionmial
Constructor takes 2 parameters, r (The number of trial succuesses), p (The probability a trial is successful)
pmf(k) returns the probability of the last succuess (of a total of r success) happening on the kth trial.
pmf() takes values from {r,r+1,r+2,...,∞}
