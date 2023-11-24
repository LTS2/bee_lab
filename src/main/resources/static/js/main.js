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
document.addEventListener('DOMContentLoaded', () => {
	const nationToggle = document.getElementById('main-nation-toggle');
	const nationDropdown = document.getElementById('main-nation-dropdown');
	const nationButton = document.querySelector('.main-summoner-nation');
	const moveLeftBtn = document.getElementById('scroll-left-btn');
	const moveRightBtn = document.getElementById('scroll-right-btn');
	const duoBoardContainer = document.getElementById('duoBoardContainer');

	// 각 아이템의 너비
	const boxWidth = 360;

	// 사용자의 브라우저 언어 가져오기
	const userLanguage = navigator.language || navigator.userLanguage;

	// 국가 버튼에 언어 설정
	if (userLanguage.startsWith('ko')) {
		nationButton.value = 'Korea';
	} if (userLanguage.startsWith("ja")) {
		nationButton.value = 'Japan';
	} if (userLanguage.startsWith("en")){
		nationButton.value = 'America';
	}

	nationToggle.addEventListener('click', () => {
		if (nationDropdown.style.display === 'none' || nationDropdown.style.display === '') {
			nationDropdown.style.display = 'block';
		} else {
			nationDropdown.style.display = 'none';
		}
	});

	// 이전에는 바로 값을 증가시켰다면, 이제는 requestAnimationFrame을 사용하여 부드러운 애니메이션 효과를 추가합니다.
	let animationFrameId;

	moveRightBtn.addEventListener('click', () => {
		const targetScroll = duoBoardContainer.scrollLeft + boxWidth;
		animateScroll(targetScroll);
	});

	moveLeftBtn.addEventListener('click', () => {
		const targetScroll = duoBoardContainer.scrollLeft - boxWidth;
		animateScroll(targetScroll);
	});

	function animateScroll(targetScroll) {
		cancelAnimationFrame(animationFrameId);

		function scrollStep() {
			const currentScroll = duoBoardContainer.scrollLeft;
			const scrollAmount = (targetScroll - currentScroll) / 10;

			// 더하던 부분을 할당으로 수정
			duoBoardContainer.scrollLeft += scrollAmount;

			if (Math.abs(targetScroll - currentScroll) > 1) {
				animationFrameId = requestAnimationFrame(scrollStep);
			}
		}

		scrollStep();
	}
});
// 닉네임 클릭 복사
function copyNicknameToClipboard(nickname) {
	// 텍스트를 선택할 요소를 가져오기
	var nicknameElement = document.createElement('textarea');
	nicknameElement.value = nickname;
	document.body.appendChild(nicknameElement);

	// 텍스트 선택 및 복사 명령 실행
	nicknameElement.select();
	document.execCommand("copy");

	// 생성한 요소 제거
	document.body.removeChild(nicknameElement);
}


