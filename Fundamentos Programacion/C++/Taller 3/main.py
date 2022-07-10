import requests
from bs4 import BeautifulSoup


def get_url(name):
    r = requests.get(f'https://animapedia.org/?s={name}')

    imprimir = BeautifulSoup(r.text, 'html.parser')

    careers_name = imprimir.find_all("a", string="Más información")
    coso = [carrer for carrer in careers_name]
    if len(coso) <= 1:
        return "Animal no encontrado"
    return coso[0]['href']


