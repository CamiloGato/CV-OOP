#include <iostream>
#include <vector>
#include <math.h>
#include<bits/stdc++.h>

using namespace std;

int trad(const string& type){

    if (type == "P"){
        return 1;
    }
    if (type == "D"){
        return 2;
    }
    if (type == "T"){
        return 3;
    }
    if (type == "C"){
        return 4;
    }

    return 0;
}

bool isReal(vector<vector<int>> vector1){
    if (vector1.front().front() == 10 and vector1.back().front() == 14){
        return true;
    }
    return false;
}

bool isColor(vector<vector<int>>& vector1 ){
    for (int i = 1; i < 5; i++) {
        if ( vector1[i][1] != vector1[i-1][1] ){
            return false;
        }
    }
    return true;
}

bool isScala(vector<vector<int>>& vector1 ){
    for (int i = 1; i < 5; i++) {
        if (vector1[i][0] - vector1[i-1][0] != 1){
            return false;
        }
    }
    return true;
}

int main() {
    int x;
    cin >> x;

    vector<vector<int>> cart;

    for (int i = 0; i < x; i++) {

        for (int j = 0; j < 5; j++) {

            int num;
            string type;
            cin >> num;
            cin >> type;

            cart.push_back({num, trad(type)});

        }

        sort(cart.begin(), cart.end(), [](const vector<int>& vector1, const vector<int>& vector2){ return vector1[0] < vector2[0];});

        if ( isScala(cart) && isColor(cart) && isReal(cart)){
            cout << "Escalera real";
        }
        else if ( isScala(cart) && isColor(cart) ){
            cout << "Escalera de color";
        }
        else if ( isScala(cart) ) {
            cout << "Escalera normal";
        }
        else if ( isColor(cart) ) {
            cout << "Color";
        } else {
            cout << "Otra mano";
        }

        cout << endl;
        cart.clear();

    }
}