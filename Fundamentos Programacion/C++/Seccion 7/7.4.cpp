#include <iostream>
#include <vector>
#include <math.h>
#include<bits/stdc++.h>

using namespace std;

double relatividad(double v){
    double c = 299792458;
    return  1.0 * sqrt(1/ sqrt( 1 - ( pow(v,2) / pow(c,2) ) ));
}

int main() {
    int x;
    cin >> x;

    for (int i = 0; i < x; i++) {
        double vel;
        cin >> vel;
        cout << setprecision(15) << relatividad(vel/3.6) << endl;
    }

}