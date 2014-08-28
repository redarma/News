var rootURL = "http://localhost:8080/RESTful_NewsMavenized/rest/news";
var newsDetailURL = "nd.html";
var findtype = "";

$.extend({
	getUrlVars : function() {
		var vars = [], hash;
		var hashes = window.location.href.slice(
				window.location.href.indexOf('?') + 1).split('&');
		for (var i = 0; i < hashes.length; i++) {
			hash = hashes[i].split('=');
			vars.push(hash[0]);
			vars[hash[0]] = hash[1];
		}
		return vars;
	},
	getUrlVar : function(name) {
		return $.getUrlVars()[name];
	},
	findByID : function(newsID, typeFind) {
		findtype = typeFind;

		$.ajax({
			type : 'GET',
			url : rootURL + '/' + newsID,
			dataType : "json", 
			success : $.renderNews
		});
	},
	findAll : function(typeFind) {
		findtype = typeFind;
		$.ajax({
			type : 'GET',
			url : rootURL + '/all',
			dataType : "json", 
			success : $.renderNews
		});
	},
	renderNews : function(data) {
		var newss = data.news == null ? []
				: (data.news instanceof Array ? data.news : [ data.news ]);

		var htmlNewsArea = "";

		$.each(newss, function(index, news) {

			var newDate = new Date(news.createdate).toLocaleDateString();
			var res = "";

			htmlNewsArea += '<p class="news-Area"><span class="bold">'
					+ newDate + '</span> &nbsp; <a href="' + newsDetailURL
					+ '?nid=' + news.newsid + '" data-identity="' + news.newsid
					+ '"><strong>' + news.title + '</strong></a></p>'
					+ '<div class="news-text"><strong>' + news.description
					+ '</strong><br/>';

			res = news.text;

			if (findtype == "findAll") {
				res = news.text.substring(0, 50);
			}

			htmlNewsArea += res;

			if (findtype == "findAll") {
				htmlNewsArea += '... <a href="' + newsDetailURL + '?nid='
						+ news.newsid + '" data-identity="' + news.newsid
						+ '">leer mas' + '</a>';
			}

			htmlNewsArea += '</div><div class="clear"> &nbsp; </div>';
		});
		$('#newsArea2').append(htmlNewsArea);
		htmlNewsArea = "";
		findtype = "";
	}
});