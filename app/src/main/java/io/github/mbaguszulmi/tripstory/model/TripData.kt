package io.github.mbaguszulmi.tripstory.model

import io.github.mbaguszulmi.tripstory.R

object TripData {
    private val tripTitles = arrayOf(
        "Wisata di Gumul Paradise Island",
        "Lika - Liku Keindahan Cangar",
        "Menikmati Paintai Balekambang",
        "Tiga Warna Dalam Satu Pantai",
        "Tenangnya Pantai Banyu Meneng",
        "Melihat Jawa di Puncak Semeru",
        "Diving Seru di Gili Ketapang",
        "Bromo: Gunung Ramah Pemula",
        "Surga Air Terjun di Kabupaten Lumajang",
        "Terjalnya Jalur Pendakian Arjuna"
    )

    private val locations = arrayOf(
        "Kediri",
        "Batu",
        "Malang",
        "Malang",
        "Malang",
        "Kab. Lumajang",
        "Kab. Probolinggo",
        "Kab. Lumajang",
        "Kab. Lumajang",
        "Kab. Malang"
    )

    private val tripImages = arrayOf(
        R.drawable.gumul_paradise,
        R.drawable.cangar,
        R.drawable.balekambang,
        R.drawable.tiga_warna,
        R.drawable.banyu_meneng,
        R.drawable.puncak_semeru,
        R.drawable.gili_ketapang,
        R.drawable.bromo,
        R.drawable.kapas_biru,
        R.drawable.gunung_arjuno
    )

    private val tripDetail = arrayOf(
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc ante turpis, condimentum id porttitor et, luctus sed sem. Fusce eget arcu non nisi dictum porttitor. Etiam ultricies orci libero, at iaculis est lacinia ac. Quisque nulla quam, aliquam eu enim ac, iaculis malesuada nibh. Ut vulputate tincidunt elit. Aenean accumsan scelerisque urna, eu pharetra libero rhoncus et. Donec quis metus a tellus imperdiet pellentesque sed at dui. Etiam erat massa, efficitur ac molestie quis, maximus a lacus. Vestibulum sodales justo neque, nec pulvinar quam pharetra ac.",
        "Ut facilisis, diam at consequat volutpat, orci dui dignissim eros, eu luctus eros nulla vel nisi. Donec finibus risus felis, sed mattis lorem facilisis vitae. Donec bibendum lorem nec augue rhoncus viverra sit amet ut diam. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur in purus rutrum, sodales ex volutpat, fermentum risus. Donec sit amet ligula eu enim facilisis malesuada eu quis quam. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; In sed lorem vitae dui semper scelerisque consequat quis nisl. Fusce risus velit, fermentum non ornare in, bibendum quis turpis. Nam rutrum massa nec sapien aliquet, in sodales augue sagittis. Mauris accumsan felis urna, eget auctor turpis tempor ut. Sed eleifend elit arcu, ac placerat ante varius facilisis. Vestibulum sodales semper elementum. Phasellus ac nisl nec massa posuere placerat vitae non sem.",
        "Vivamus vestibulum nisi eget turpis gravida, tincidunt hendrerit magna efficitur. Nulla sodales sit amet dui non eleifend. Fusce bibendum rutrum lacus, nec viverra nisi venenatis nec. Praesent nunc quam, laoreet vel nisl ac, fringilla fermentum dolor. Proin sodales lectus id orci fringilla, id euismod arcu euismod. Donec eu maximus nunc. Cras viverra est vel ipsum maximus ullamcorper. Quisque sed nulla quis massa malesuada tempus.",
        "Mauris sit amet purus ac odio sodales convallis. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean posuere at nibh eget dictum. Donec sit amet metus erat. Suspendisse a felis ac dolor commodo viverra. Aliquam euismod mi nec augue euismod fermentum. Duis sed nisi in purus egestas tempor viverra sit amet sapien. Cras non sagittis felis. Mauris quis facilisis quam. Suspendisse potenti. Ut tincidunt justo vel erat pretium commodo. Vivamus quis ante et ipsum tincidunt pharetra a eget eros. Suspendisse pulvinar enim iaculis aliquam tincidunt. Morbi faucibus sagittis imperdiet.",
        "Nam rhoncus lorem nec neque accumsan hendrerit. Etiam volutpat bibendum ante, id auctor justo pharetra sit amet. Proin aliquam justo eu vestibulum consectetur. Maecenas quis nisl eget urna ornare congue ut non mi. Vestibulum bibendum venenatis massa. Quisque ut odio fermentum, lobortis urna ac, eleifend erat. Aenean egestas fermentum nunc, vitae sodales nulla efficitur in. Cras sed nibh dapibus, ultricies nibh eu, tristique ligula. Curabitur eu lacus tempor, facilisis sapien elementum, mattis quam. Cras cursus ac sapien ut consectetur. In et rutrum enim. Duis porttitor lorem sapien, eget tristique erat pellentesque sed.",
        "Donec sit amet condimentum ipsum. Nunc aliquet erat justo, sit amet pharetra ligula aliquet ut. Vivamus molestie nisi eget libero vestibulum, a interdum nibh elementum. Mauris ut purus accumsan, tincidunt urna nec, malesuada enim. Donec congue, massa vel molestie molestie, libero diam finibus tellus, at placerat ligula mauris et purus. Sed convallis dui at tincidunt volutpat. Duis ac egestas tellus. Vivamus pretium nibh non ligula consectetur interdum. Duis quam est, mattis sed elit et, mollis fringilla velit. Mauris lacinia congue nulla at fringilla. Integer feugiat velit sit amet dapibus efficitur. Cras sed ante nec neque commodo vulputate. Maecenas ac sodales velit. Quisque congue convallis nunc.",
        "Morbi cursus vehicula vehicula. Ut ut neque eget sem egestas tincidunt. Aliquam sed felis eros. Donec felis sem, ornare in est ac, aliquam interdum arcu. Morbi gravida id ante et ullamcorper. Ut ipsum neque, eleifend et consequat ut, commodo molestie leo. Aliquam eget lacus sit amet mi tristique sollicitudin sed et mi. Donec faucibus porta metus in ornare. Aenean vehicula magna sed massa fermentum tincidunt. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque sit amet tellus enim. Vestibulum sed pretium lacus. Aenean quis urna tellus.",
        "Aenean hendrerit lectus finibus efficitur sollicitudin. Suspendisse placerat, nibh eget mattis luctus, magna ligula hendrerit arcu, ut scelerisque lorem urna et erat. Aenean vitae hendrerit massa, quis mollis nulla. Fusce sed mattis ligula. Donec in justo a nunc posuere tristique. Curabitur sed ipsum non enim auctor tincidunt eget eu urna. Nunc gravida in turpis vel ultricies.",
        "In varius sollicitudin nibh. Nam sit amet molestie massa, id malesuada tellus. Aenean ultricies tempus congue. Morbi mollis neque vel justo ultricies, quis iaculis lacus tempus. Nunc placerat, neque vitae euismod dictum, urna libero porta dui, sed dignissim dolor dui non velit. Nunc diam turpis, scelerisque sed aliquam in, dignissim pharetra dui. Aliquam commodo laoreet malesuada. Aenean aliquam tellus quis urna auctor tempus. Duis orci tellus, suscipit quis ex non, bibendum posuere est.",
        "Proin condimentum fringilla sem nec ullamcorper. Maecenas nec cursus mi. Phasellus vestibulum porta dolor et rhoncus. Donec tincidunt nisi sed tortor commodo aliquam quis eget lorem. Nulla gravida aliquam nibh, sit amet eleifend justo ultricies vitae. Mauris pellentesque mollis ullamcorper. In a eros et mi tempor interdum in non odio. Donec aliquet massa ut arcu scelerisque, a molestie ligula feugiat. Quisque ornare tortor non mauris tincidunt, a semper elit vehicula. Donec nec aliquet enim. Etiam tempor fermentum luctus. Vivamus vel ex id leo congue euismod eu tempus massa. Donec ac purus ultrices, tincidunt est sollicitudin, condimentum neque."
    )

    private val users = arrayOf(
        "Dewangga Putra",
        "Yogi Andri",
        "Ony Indra Permana",
        "Putri Sandrawati",
        "Abdul Wahid",
        "Achmad Anang",
        "Erina Fitrianingsih",
        "Joko Sutopo",
        "Aji Prasetya",
        "Wibawa Darmo"
    )

    val listData: ArrayList<Trip>
        get() {
            val list = arrayListOf<Trip>()
            for (position in tripTitles.indices) {
                val trip = Trip()
                trip.title = tripTitles[position]
                trip.location = locations[position]
                trip.tripImage = tripImages[position]
                trip.tripDetail = tripDetail[position]
                trip.user = users[position]
                trip.userAvatar = R.drawable.default_avatar
                list.add(trip)
            }
            return list
        }
}
