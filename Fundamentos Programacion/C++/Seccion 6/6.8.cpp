#include <iostream>
#include <vector>

using namespace std;

int main() {
    int x;
    int num;
    cin >> x;

    vector<int> romp;
    for (int ix = 1; ix < x; ix++) {
        cin >> num;
        romp.insert(romp.end(), num);
    }

    sort(romp.begin(), romp.end());

    for (int idx = 0; idx < romp.size(); idx++) {
        if ( romp[0] != 1 ){
            cout << "La ficha faltante es la 1";
            break;
        }
        if ( romp[romp.size() - 1] != x ) {
            cout << "La ficha faltante es la " << x;
            break;
        }
        if ( idx != 0 ){
            if ( romp[idx] - romp[idx-1] > 1 ){
                cout << "La ficha faltante es la " << romp[idx] - 1;
                break;
            }
        }
    }
}