# Ferramenta de leitura para GPRO

## Função
Trata-se de uma ferramenta de auxílio para o jogo GPRO (https://www.gpro.net/), um simulador de gerenciamento de equipes de F1.

## Objetivo
Essa pequena ferramenta pretende permitir que você consiga armazenar e recuperar históricos de corridas, *setups*, históricos do piloto, voltas de teste, qualificações, *pitstops*, *practices*, e climas em que aconteceram a corrida ou os testes; permite também que seu time guarde todas essas informações em conjunto e as compartilhem entre si, e auxilia a enxergar esses dados sob várias perspectivas bastante úteis para análises e cálculos via uma interface gráfica.

Tecnicamente, este programa, dadas as informações de uma conta, realiza na página principal do jogo um login e faz um *HTML scraping* de todos os dados desde a última corrida e os armazena em um banco de dados, de onde podem ser feitas pesquisas atráves da ajuda de uma interface gráfica.

## Requisitos
Sumariamente, o programa deve colher da página:

1. Dados sobre última corrida
    * Staff e Instalações
        - Todos os níveis das instalações na corrida (Centro de treinamento de pit, oficina de engenharia, etc.)
        - Todas as habilidades do Staff na corrida (experiência, motivação, habilidade técnica, concentração, tolerância à pressão, eficiência)
    * Piloto
        - Todos os skills do piloto antes da corrida (total (média), concentração, talento, agressividade, experiência, conhecimento técnico, resistência, carisma, motivação, reputação, peso e idade)
        - Nível de energia (0% a 100%) antes e depois da corrida
        - Pontos de skills dado ao piloto depois da corrida
    * Voltas de treinamento
        - Tempo de volta
        - Erro do piloto
        - Net time
        - Setup
        - Pneus utilizados
    * Voltas da corrida
        - Tempo da volta
        - Posição
        - Pneu usado
        - Clima da volta
        - Temperatura
        - Umidade
        - Eventos (pit, erro do piloto, etc.)
    * Pitstops
        - Número da volta do pit
        - Motivo do pit
        - Condição dos pneus
        - Combustível restante
        - Abastecimento
        - Tempo de pit
    * Qualificações
        - Tempo de volta da Q1
        - Tempo de volta da Q2
        - Setup do carro utilizado na Q1
        - Setup do carro utilizado na Q2
    * Estratégia
        - Setup da corrida
        - Risco de largada
        - Riscos de ultrapassagem, defesa, clear track, seco ou molhado, e em caso de malfuncionamento do carro
    * Clima
        - Clima, temperatura e umidade das voltas de treino, Q1, Q2
        - Previsão do tempo para cada quarto (1/4) de corrida
    * Características do carro
        - Pontos de potência, dirigibilidade, e aceleração
        - níveis das peças chassi, motor, asa dianteira e traseira, assoalho, laterais, radiador, câmbio, freios, suspensão e eletrônicas
    * Desgaste de peças do carro
        - Desgaste de cada uma das peças (0% a 100%) do carro antes da corrida
        - Desgaste de cada uma das peças depois da corrida 
    * Custos e ganhos
        - Total ganho com a qualificação
        - Total ganho com a posição do piloto na corrida
        - Total ganho com patrocinadores
        - Salário do piloto
        - Salário do staff
        - Custo das instalações
        
2. Dados sobre o teste
     * Pista
        - Nome da pista
        - Clima, teperatura e umidade da pista no dia do teste
        - Características da pista
     * Stints
         - Número de voltas
         - Melhor tempo
         - Média do tempo das voltas
         - Setup do carro
         - Combustível inicial
         - Condição dos pneus
         - Combustível final
     * Desgaste das peças do carro
         - Desgaste de todas as peças do carro antes e depois das voltas de teste
  
E conseguir depois exibir cada um destes dados depois ao usuário, caso seja pedido, sob as seguintes perspectivas:

* Todas as voltas dadas em uma determinada pista (sendo de uma única corrida, ou todas já feitas)

* Estratégia(s) utilizada(s) em uma determinada pista, podendo ser em função de clima, desgaste de peças do carro, skills do piloto, ou resultados da corrida (posição de largada e chegada)

* Histórico de skills do piloto em função das corridas
    

## Equipe
#### Marcelo Augusto Stefanini Faria
<sup><sup>RA: 173574</sup></sup>
#### Rafael Augusto Barbaroto de Araújo
<sup><sup>RA: 176066</sup></sup>
