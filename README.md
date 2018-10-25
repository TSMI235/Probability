# Probability

## About
I started this project after taking a Probability class. I wanted to create functions to model all of  
the variables and distributions. After all of these functions are fully implemented and working  
I plan to add an interactive interface to use of the the fucntions to be used as a sort of homework  
checker for Math 3355

## Discrete Random Variables
Abstract class for all of the following random variables  
Shares fullpmf() method that prints the full probability mass function in the case  
that the distribution has a range.  
  
### Binomial Random Variable
Accessible with the class Binomial  
Constructor takes two parameters, n (The number of trials ran), p (The probability a trial is successful)  
pmf(k) returns the probability of k success in n trials.  
pmf() takes values from {0,1,2,...,n}  

### Geometric Random Variable
Accessible with the class Geometric  
Constructor takes one parameter, p (The probability a trial is successful)  
pmf(k) returns the probability of of the first success happening on the kth trial.  
pmf() takes values from {1,2,...,∞}  

### Negative Binomial Variable
Accessible with the class NegativeBinomial  
Constructor takes 2 parameters, r (The number of trial successes), p (The probability a trial is successful)  
pmf(k) returns the probability of the last success (of a total of r success) happening on the kth trial.  
pmf() takes values from {r,r+1,r+2,...,∞}  

### Poisson Random Variable
Accessible with the class Poisson
Constructor takes 1 parameter, y (Also known as lambda denoted y here)  
pmf(k) returns the probability of a success on the kth trial
