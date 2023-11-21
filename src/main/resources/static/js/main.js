$(()=> {

	// 메인 전적 검색 js
	$('#main-search-form').submit(function (e){
		e.preventDefault();
		let summonerName = $('#main-summoner-name').val();

		/**
		 * 사용자 입력에 특수문자가 포함될 가능성이 있는 경우, 안전성을 위해 'encodeURIComponent()'를 사용하는 것이 좋음.
		 * 일반적인 문자열의 경우에는 사용하지 않아도 됨.
		 */
		window.location.href = '/summoners' + '/kr/' + encodeURIComponent(summonerName);
	})
})