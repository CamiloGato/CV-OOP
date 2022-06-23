#include <iostream>
#include <vector>
#include <numeric>

using namespace std;

int main(){
    while (true){
        string num;
        string nums = "12345";
        cin >> num;
        if (stof(num) == 0){
            break;
        }
        int count = 0;
        for (char & i : nums) {
            if ( find(num.begin(), num.end(), i) != num.end() ) {
                count++;
            }
        }
        if (count == 5){
            cout << "Multidigito" << endl;
        }
        else {
            cout << "No es multidigito" << endl;
        }
    }
}