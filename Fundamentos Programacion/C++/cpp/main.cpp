#include <iostream>
#include <vector>
#include <math.h>
#include <filesystem>
#include<bits/stdc++.h>
#include <unistd.h>

using namespace std;


map< char, string > ascii_to_morse =
{
        {'A',".-"},
        {'B',"-..."},
        {'C',"-.-."},
        {'D',"-.."},
        {'E',"."},
        {'F',"..-."},
        {'G',"--."},
        {'H',"...."},
        {'I',".."},
        {'J',".---"},
        {'K',"-.-"},
        {'L',".-.."},
        {'M',"--"},
        {'N',"-."},
        {'O',"---"},
        {'P',".--."},
        {'Q',"--.-"},
        {'R',".-."},
        {'S',"..."},
        {'T',"-"},
        {'U',"..-"},
        {'V',"...-"},
        {'W',".--"},
        {'X',"-..-"},
        {'Y',"-.--"},
        {'Z',"--.."},
        {'.',".-.-.-"},
        {',',"-.-.--"},
};

string traductor(string texto){
    for_each(texto.begin(), texto.end(), [](char &e){ toupper(e); });
    return texto;
}

int main()
{
    int cantidad;
    cin >> cantidad;
    for (int i = 0; i < cantidad; ++i) {
        cout << traductor("coma mierda pirobo hpta");
    }
}