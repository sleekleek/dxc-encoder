# dxc-encoder
Encoder for DXC Technology

Written by Sheriann Ngui

## Prerequisites
- Java (Tested on 11)

## Instructions to run
1. Compile with `javac Main.java`
2. Run with `java -cp . Main`

## To run example
1. Compile with `javac Example.java`
2. Run with `java -cp . Example`

## Encoder Description
You are to write an encoder that takes in a plaintext and encode it to another obfuscated string. 

The logic of the encoding / decoding is:

Choose any character in the reference table as the offset. The first character of the encoded message will be the offset character. Any character not in the reference table will mapped back to the same character.