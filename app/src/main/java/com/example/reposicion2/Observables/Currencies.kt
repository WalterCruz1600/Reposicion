package com.telus.techinterviewcompose.data

data class Currencies(
    val acronym: String,
    val name: String = ""
)

fun listado():List<Currencies>{

    return currencies1
}

val currencies1: List<Currencies> = listOf(
    Currencies(acronym = "1inch", name = "1inch Network"),
    Currencies(acronym = "aave", name = "Aave"),
    Currencies(acronym = "ada", name = "Cardano"),
    Currencies(acronym = "aed", name = "United Arab Emirates Dirham"),
    Currencies(acronym = "afn", name = "Afghan afghani"),
    Currencies(acronym = "algo", name = "Algorand"),
    Currencies(acronym = "all", name = "Albanian lek"),
    Currencies(acronym = "amd", name = "Armenian dram"),
    Currencies(acronym = "amp", name = "Synereo"),
    Currencies(acronym = "ang", name = "Netherlands Antillean Guilder"),
    Currencies(acronym = "aoa", name = "Angolan kwanza"),
    Currencies(acronym = "ar", name = "Arweave"),
    Currencies(acronym = "ars", name = "Argentine peso"),
    Currencies(acronym = "atom", name = "Atomic Coin"),
    Currencies(acronym = "aud", name = "Australian dollar"),
    Currencies(acronym = "avax", name = "Avalanche"),
    Currencies(acronym = "awg", name = "Aruban florin"),
    Currencies(acronym = "axs", name = "AXS"),
    Currencies(acronym = "azn", name = "Azerbaijani manat"),
    Currencies(acronym = "bam", name = "Bosnia-Herzegovina Convertible Mark"),
    Currencies(acronym = "bat", name = "Basic Attention Token"),
    Currencies(acronym = "bbd", name = "Bajan dollar"),
    Currencies(acronym = "bch", name = "Bitcoin Cash"),
    Currencies(acronym = "bdt", name = "Bangladeshi taka"),
    Currencies(acronym = "bgn", name = "Bulgarian lev"),
    Currencies(acronym = "bhd", name = "Bahraini dinar"),
    Currencies(acronym = "bif", name = "Burundian Franc"),
    Currencies(acronym = "bmd", name = "Bermudan dollar"),
    Currencies(acronym = "bnb", name = "Binance Coin"),
    Currencies(acronym = "bnd", name = "Brunei dollar"),
    Currencies(acronym = "bob", name = "Bolivian boliviano"),
    Currencies(acronym = "brl", name = "Brazilian real"),
    Currencies(acronym = "bsd", name = "Bahamian dollar"),
    Currencies(acronym = "bsv", name = "Bitcoin SV"),
    Currencies(acronym = "btc", name = "Bitcoin"),
    Currencies(acronym = "btcb", name = "Bitcoin BEP2"),
    Currencies(acronym = "btg", name = "Bitcoin Gold"),
    Currencies(acronym = "btn", name = "Bhutan Currencies"),
    Currencies(acronym = "busd", name = "Binance USD"),
    Currencies(acronym = "bwp", name = "Botswanan Pula"),
    Currencies(acronym = "byn", name = "New Belarusian Ruble"),
    Currencies(acronym = "byr", name = "Belarusian Ruble"),
    Currencies(acronym = "bzd", name = "Belize dollar"),
    Currencies(acronym = "cad", name = "Canadian dollar"),
    Currencies(acronym = "cake", name = "PancakeSwap"),
    Currencies(acronym = "cdf", name = "Congolese franc"),
    Currencies(acronym = "celo", name = "Celo"),
    Currencies(acronym = "chf", name = "Swiss franc"),
    Currencies(acronym = "chz", name = "Chiliz"),
    Currencies(acronym = "clf", name = "Chilean Unit of Account (UF)"),
    Currencies(acronym = "clp", name = "Chilean peso"),
    Currencies(acronym = "cny", name = "Chinese Yuan"),
    Currencies(acronym = "comp", name = "Compound Coin"),
    Currencies(acronym = "cop", name = "Colombian peso"),
    Currencies(acronym = "crc", name = "Costa Rican Colón"),
    Currencies(acronym = "cro", name = "Crypto.com Chain Token"),
    Currencies(acronym = "crv", name = "Cravy"),
    Currencies(acronym = "cuc", name = "Cuban peso"),
    Currencies(acronym = "cup", name = "Cuban Peso"),
    Currencies(acronym = "cve", name = "Cape Verdean escudo"),
    Currencies(acronym = "cvx", name = "Convex Finance"),
    Currencies(acronym = "czk", name = "Czech koruna"),
    Currencies(acronym = "dai", name = "Dai"),
    Currencies(acronym = "dash", name = "Dash"),
    Currencies(acronym = "dcr", name = "Decred"),
    Currencies(acronym = "dfi", name = "DfiStarter"),
    Currencies(acronym = "djf", name = "Djiboutian franc"),
    Currencies(acronym = "dkk", name = "Danish krone"),
    Currencies(acronym = "doge", name = "Dogecoin"),
    Currencies(acronym = "dop", name = "Dominican peso"),
    Currencies(acronym = "dot", name = "Dotcoin"),
    Currencies(acronym = "dzd", name = "Algerian dinar"),
    Currencies(acronym = "egld", name = "Elrond"),
    Currencies(acronym = "egp", name = "Egyptian pound"),
    Currencies(acronym = "enj", name = "Enjin Coin"),
    Currencies(acronym = "eos", name = "EOS"),
    Currencies(acronym = "ern", name = "Eritrean nakfa"),
    Currencies(acronym = "etb", name = "Ethiopian birr"),
    Currencies(acronym = "etc", name = "Ethereum Classic"),
    Currencies(acronym = "eth", name = "Ether"),
    Currencies(acronym = "eur", name = "Euro"),
    Currencies(acronym = "fei", name = "Fei USD"),
    Currencies(acronym = "fil", name = "FileCoin"),
    Currencies(acronym = "fjd", name = "Fijian dollar"),
    Currencies(acronym = "fkp", name = "Falkland Islands pound"),
    Currencies(acronym = "flow", name = "Flow"),
    Currencies(acronym = "frax", name = "Frax"),
    Currencies(acronym = "ftm", name = "Fantom"),
    Currencies(acronym = "ftt", name = "FarmaTrust"),
    Currencies(acronym = "gala", name = "Gala"),
    Currencies(acronym = "gbp", name = "Pound sterling"),
    Currencies(acronym = "gel", name = "Georgian lari"),
    Currencies(acronym = "ggp", name = "GGPro"),
    Currencies(acronym = "ghs", name = "Ghanaian cedi"),
    Currencies(acronym = "gip", name = "Gibraltar pound"),
    Currencies(acronym = "gmd", name = "Gambian dalasi"),
    Currencies(acronym = "gnf", name = "Guinean franc"),
    Currencies(acronym = "gno", name = "Gnosis"),
    Currencies(acronym = "grt", name = "Golden Ratio Token"),
    Currencies(acronym = "gt", name = "GateToken"),
    Currencies(acronym = "gtq", name = "Guatemalan quetzal"),
    Currencies(acronym = "gyd", name = "Guyanaese Dollar"),
    Currencies(acronym = "hbar", name = "Hedera"),
    Currencies(acronym = "hkd", name = "Hong Kong dollar"),
    Currencies(acronym = "hnl", name = "Honduran lempira"),
    Currencies(acronym = "hnt", name = "Helium"),
    Currencies(acronym = "hot", name = "Hydro Protocol"),
    Currencies(acronym = "hrk", name = "Croatian kuna"),
    Currencies(acronym = "ht", name = "Huobi Token"),
    Currencies(acronym = "htg", name = "Haitian gourde"),
    Currencies(acronym = "huf", name = "Hungarian forint"),
    Currencies(acronym = "icp", name = "Internet Computer"),
    Currencies(acronym = "idr", name = "Indonesian rupiah"),
    Currencies(acronym = "ils", name = "Israeli New Shekel"),
    Currencies(acronym = "imp", name = "CoinIMP"),
    Currencies(acronym = "inj", name = "Injective"),
    Currencies(acronym = "inr", name = "Indian rupee"),
    Currencies(acronym = "iqd", name = "Iraqi dinar"),
    Currencies(acronym = "irr", name = "Iranian rial"),
    Currencies(acronym = "isk", name = "Icelandic króna"),
    Currencies(acronym = "jep", name = "Jersey Pound"),
    Currencies(acronym = "jmd", name = "Jamaican dollar"),
    Currencies(acronym = "jod", name = "Jordanian dinar"),
    Currencies(acronym = "jpy", name = "Japanese yen"),
    Currencies(acronym = "kava", name = "Kava"),
    Currencies(acronym = "kcs", name = "Kucoin"),
    Currencies(acronym = "kda", name = "Kadena"),
    Currencies(acronym = "kes", name = "Kenyan shilling"),
    Currencies(acronym = "kgs", name = "Kyrgystani Som"),
    Currencies(acronym = "khr", name = "Cambodian riel"),
    Currencies(acronym = "klay", name = "Klaytn"),
    Currencies(acronym = "kmf", name = "Comorian franc"),
    Currencies(acronym = "knc", name = "Kyber Network"),
    Currencies(acronym = "kpw", name = "North Korean won"),
    Currencies(acronym = "krw", name = "South Korean won"),
    Currencies(acronym = "ksm", name = "Kusama"),
    Currencies(acronym = "kwd", name = "Kuwaiti dinar"),
    Currencies(acronym = "kyd", name = "Cayman Islands dollar"),
    Currencies(acronym = "kzt", name = "Kazakhstani tenge"),
    Currencies(acronym = "lak", name = "Laotian Kip"),
    Currencies(acronym = "lbp", name = "Lebanese pound"),
    Currencies(acronym = "leo", name = "LEOcoin"),
    Currencies(acronym = "link", name = "ChainLink"),
    Currencies(acronym = "lkr", name = "Sri Lankan rupee"),
    Currencies(acronym = "lrc", name = "Loopring"),
    Currencies(acronym = "lrd", name = "Liberian dollar"),
    Currencies(acronym = "lsl", name = "Lesotho loti"),
    Currencies(acronym = "ltc", name = "Litecoin"),
    Currencies(acronym = "ltl", name = "Lithuanian litas"),
    Currencies(acronym = "luna", name = "Luna Coin"),
    Currencies(acronym = "lvl", name = "Latvian lats"),
    Currencies(acronym = "lyd", name = "Libyan dinar"),
    Currencies(acronym = "mad", name = "Moroccan dirham"),
    Currencies(acronym = "mana", name = "Decentraland"),
    Currencies(acronym = "matic", name = "Polygon"),
    Currencies(acronym = "mdl", name = "Moldovan leu"),
    Currencies(acronym = "mga", name = "Malagasy ariary"),
    Currencies(acronym = "mina", name = "Mina"),
    Currencies(acronym = "miota", name = "IOTA"),
    Currencies(acronym = "mkd", name = "Macedonian denar"),
    Currencies(acronym = "mkr", name = "Maker"),
    Currencies(acronym = "mmk", name = "Myanmar Kyat"),
    Currencies(acronym = "mnt", name = "Mongolian tugrik"),
    Currencies(acronym = "mop", name = "Macanese pataca"),
    Currencies(acronym = "mro", name = "Mauritanian ouguiya"),
    Currencies(acronym = "mur", name = "Mauritian rupee"),
    Currencies(acronym = "mvr", name = "Maldivian rufiyaa"),
    Currencies(acronym = "mwk", name = "Malawian kwacha"),
    Currencies(acronym = "mxn", name = "Mexican peso"),
    Currencies(acronym = "myr", name = "Malaysian ringgit"),
    Currencies(acronym = "mzn", name = "Mozambican Metical"),
    Currencies(acronym = "nad", name = "Namibian dollar"),
    Currencies(acronym = "near", name = "NEAR Protocol"),
    Currencies(acronym = "neo", name = "NEO"),
    Currencies(acronym = "nexo", name = "NEXO"),
    Currencies(acronym = "ngn", name = "Nigerian naira"),
    Currencies(acronym = "nio", name = "Nicaraguan córdoba"),
    Currencies(acronym = "nok", name = "Norwegian krone"),
    Currencies(acronym = "npr", name = "Nepalese rupee"),
    Currencies(acronym = "nzd", name = "New Zealand dollar"),
    Currencies(acronym = "okb", name = "Okex"),
    Currencies(acronym = "omr", name = "Omani rial"),
    Currencies(acronym = "one", name = "Menlo One"),
    Currencies(acronym = "pab", name = "Panamanian balboa"),
    Currencies(acronym = "paxg", name = "PAX Gold"),
    Currencies(acronym = "pen", name = "Sol"),
    Currencies(acronym = "pgk", name = "Papua New Guinean kina"),
    Currencies(acronym = "php", name = "Philippine peso"),
    Currencies(acronym = "pkr", name = "Pakistani rupee"),
    Currencies(acronym = "pln", name = "Poland złoty"),
    Currencies(acronym = "pyg", name = "Paraguayan guarani"),
    Currencies(acronym = "qar", name = "Qatari Rial"),
    Currencies(acronym = "qnt", name = "Quant"),
    Currencies(acronym = "qtum", name = "QTUM"),
    Currencies(acronym = "ron", name = "Romanian leu"),
    Currencies(acronym = "rsd", name = "Serbian dinar"),
    Currencies(acronym = "rub", name = "Russian ruble"),
    Currencies(acronym = "rune", name = "THORChain (ERC20)"),
    Currencies(acronym = "rwf", name = "Rwandan Franc"),
    Currencies(acronym = "sand", name = "BeachCoin"),
    Currencies(acronym = "sar", name = "Saudi riyal"),
    Currencies(acronym = "sbd", name = "Solomon Islands dollar"),
    Currencies(acronym = "scr", name = "Seychellois rupee"),
    Currencies(acronym = "sdg", name = "Sudanese pound"),
    Currencies(acronym = "sek", name = "Swedish krona"),
    Currencies(acronym = "sgd", name = "Singapore dollar"),
    Currencies(acronym = "shib", name = "Shiba Inu"),
    Currencies(acronym = "shp", name = "Saint Helena pound"),
    Currencies(acronym = "sle", name = ""),
    Currencies(acronym = "sll", name = "Sierra Leonean leone"),
    Currencies(acronym = "sol", name = "Sola"),
    Currencies(acronym = "sos", name = "Somali shilling"),
    Currencies(acronym = "srd", name = "Surinamese dollar"),
    Currencies(acronym = "std", name = "São Tomé and Príncipe Dobra (pre-2018)"),
    Currencies(acronym = "stx", name = "Stox"),
    Currencies(acronym = "svc", name = "Salvadoran Colón"),
    Currencies(acronym = "syp", name = "Syrian pound"),
    Currencies(acronym = "szl", name = "Swazi lilangeni"),
    Currencies(acronym = "thb", name = "Thai baht"),
    Currencies(acronym = "theta", name = "Theta"),
    Currencies(acronym = "tjs", name = "Tajikistani somoni"),
    Currencies(acronym = "tmt", name = "Turkmenistani manat"),
    Currencies(acronym = "tnd", name = "Tunisian dinar"),
    Currencies(acronym = "top", name = "Tongan Paʻanga"),
    Currencies(acronym = "trx", name = "TRON"),
    Currencies(acronym = "try", name = "Turkish lira"),
    Currencies(acronym = "ttd", name = "Trinidad & Tobago Dollar"),
    Currencies(acronym = "ttt", name = "Tap Project"),
    Currencies(acronym = "tusd", name = "True USD"),
    Currencies(acronym = "twd", name = "New Taiwan dollar"),
    Currencies(acronym = "tzs", name = "Tanzanian shilling"),
    Currencies(acronym = "uah", name = "Ukrainian hryvnia"),
    Currencies(acronym = "ugx", name = "Ugandan shilling"),
    Currencies(acronym = "uni", name = "Universe"),
    Currencies(acronym = "usd", name = "United States dollar"),
    Currencies(acronym = "usdc", name = "USD Coin"),
    Currencies(acronym = "usdp", name = "USDP Stablecoin"),
    Currencies(acronym = "usdt", name = "Tether"),
    Currencies(acronym = "uyu", name = "Uruguayan peso"),
    Currencies(acronym = "uzs", name = "Uzbekistani som"),
    Currencies(acronym = "vef", name = "Sovereign Bolivar"),
    Currencies(acronym = "vet", name = "Vechain"),
    Currencies(acronym = "vnd", name = "Vietnamese dong"),
    Currencies(acronym = "vuv", name = "Vanuatu vatu"),
    Currencies(acronym = "waves", name = "Waves"),
    Currencies(acronym = "wbtc", name = "Wrapped Bitcoin"),
    Currencies(acronym = "wemix", name = "WEMIX"),
    Currencies(acronym = "wst", name = "Samoan tala"),
    Currencies(acronym = "xaf", name = "Central African CFA franc"),
    Currencies(acronym = "xag", name = "Silver Ounce"),
    Currencies(acronym = "xau", name = "XauCoin"),
    Currencies(acronym = "xcd", name = "East Caribbean dollar"),
    Currencies(acronym = "xch", name = "Chia"),
    Currencies(acronym = "xdc", name = "XDC Network"),
    Currencies(acronym = "xdr", name = "Special Drawing Rights"),
    Currencies(acronym = "xec", name = "Eternal Coin"),
    Currencies(acronym = "xem", name = "NEM"),
    Currencies(acronym = "xlm", name = "Stellar"),
    Currencies(acronym = "xmr", name = "Monero"),
    Currencies(acronym = "xof", name = "West African CFA franc"),
    Currencies(acronym = "xpf", name = "CFP franc"),
    Currencies(acronym = "xrp", name = "XRP"),
    Currencies(acronym = "xtz", name = "Tezos"),
    Currencies(acronym = "yer", name = "Yemeni rial"),
    Currencies(acronym = "zar", name = "South African rand"),
    Currencies(acronym = "zec", name = "ZCash"),
    Currencies(acronym = "zil", name = "Zilliqa"),
    Currencies(acronym = "zmk", name = "Zambian kwacha"),
    Currencies(acronym = "zmw", name = "Zambian Kwacha"),
    Currencies(acronym = "zwl", name = "Zimbabwean Dollar")
)